<%@page import="com.google.gson.JsonObject"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.google.gson.Gson"
	import="com.google.gson.GsonBuilder" import="java.util.Base64"
	import="java.nio.charset.StandardCharsets"
	import="java.net.HttpURLConnection" import="java.net.URL"
	import="java.io.BufferedReader" import="java.io.InputStreamReader"
	import="java.io.IOException" import="gurpssheet.CharacterSheet"%>

<!DOCTYPE html>
<html lang="english">
<head>
<meta charset="ISO-8859-1">
<title>Start Here</title>
</head>
<body>
	<a href="rest/sheets/blank">New Blank Sheet</a>
	<%
		String authorization = request.getHeader("Authorization");
		String base64Credentials = null;
		String[] values;
		if (authorization != null && authorization.toLowerCase().startsWith("basic")) {
			log("auth");
			// Authorization: Basic base64credentials
			base64Credentials = authorization.substring("Basic".length()).trim();
			byte[] credDecoded = Base64.getDecoder().decode(base64Credentials);
			String credentials = new String(credDecoded, StandardCharsets.UTF_8);
			// credentials = username:password
			values = credentials.split(":", 2);
		} else {
			log("noauth");
		}
		int port = request.getLocalPort();
		String proto = "http";
		if (request.isSecure()) {
			proto = "https";
		}

		String blankTarget = proto + "://localhost:" + port + request.getContextPath() + "/rest/sheets/blank";
		URL blankUrl = new URL(blankTarget);
		HttpURLConnection blankConn = (HttpURLConnection) blankUrl.openConnection();
		blankConn.setRequestMethod("GET");
		blankConn.setRequestProperty("User-Agent", "Mozilla/5.0");
		if (null != base64Credentials) {
			blankConn.setRequestProperty("Authorization", "Basic " + base64Credentials);
		}
		int code = blankConn.getResponseCode();
		if (HttpURLConnection.HTTP_OK == code) {
			log("http OK");
			try (BufferedReader readIn = new BufferedReader(new InputStreamReader(blankConn.getInputStream()))) {
				StringBuilder sb = new StringBuilder();
				String inputLine;
				while ((inputLine = readIn.readLine()) != null) {
					sb.append(inputLine);
				}
				String json = sb.toString();
	%><p>
	<strong>Example Character Object</strong>
	</p>
	<pre><%
	Gson g = new GsonBuilder().setLenient().setPrettyPrinting().create();
	JsonObject jso = g.fromJson(json, JsonObject.class);
	out.print(g.toJson(jso));
	%></pre>
	<%
		} catch (IOException ioe) {
				log("Error getting blank sheet from internal URL", ioe);

			}
			;

		} else {
			log("FAILED: " + code + "REACHING " + blankTarget);
			out.println("FAILED: " + code + "REACHING " + blankTarget);
		}
	%>
</body>
</html>