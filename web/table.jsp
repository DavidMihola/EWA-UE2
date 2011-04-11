<?xml version="1.0" encoding="UTF-8"?>

<jsp:useBean id="tableBean" class="beans.TableBean" scope="session" />
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="de" lang="de">
<head>
<meta http-equiv="Content-Type" content="application/xhtml+xml; charset=utf-8" />
<meta name="description" content="EWA Memory Spiel" />
<meta name="author" content="Christian Zwettler, David Mihola, Florian Mihola" />
<meta name="keywords" content="EWA, Entwicklung von Webanwendungen, Memory, Spiel, Karten, aufdecken" />

<title>EWA Memory Spiel</title>
<link href="styles/reset.css" rel="stylesheet" type="text/css"
	media="screen" />
<link href="styles/screen.css" rel="stylesheet" type="text/css"
	media="screen" />

<!--[if lt IE 8]>
<link href="styles/ie-screen.css" rel="stylesheet" type="text/css"
	media="screen" />
<![endif]-->

</head>
<body>
<div id="page">
	<div id="wrapper">
		<div id="header">
			<img id="header_left" src="img/header_left.png" alt="EWA Memory Header Logo" />
			<img id="header_right" src="img/header_right.png" alt="EWA Memory Header Logo" />
		</div>
		<div id="navigation">
			<ul title="Navigation">
				<li><a href="?daten_aendern">Userdaten ändern</a></li>
				<li><a href="?lounge">Zurück zur Lounge</a></li>
				<li><a href="?logout">Ausloggen</a></li>
			</ul>
			<hr class="solid_clear" />
		</div>
		<div id="main">
			<h1 class="hidden">EWA Memory Spiel</h1>
			<div id="stats">
				<h2 class="hidden">Informationen zum Spiel</h2>
				<h3>Spielstand</h3>
				<table id="current"
				       title="Spielstand im aktuellen Spiel"
				       summary="Spielstand im aktuellen Spiel">
					<thead>
					<tr>
						<th></th>
						<th>Du</th>
						<th>Gegner</th>
					</tr>
				        </thead>
					<tbody>
					<tr>
						<th>Paare</th>
						<td><jsp:getProperty name="tableBean" property="pairsSelf" /></td>
						<td><jsp:getProperty name="tableBean" property="pairsOponent" /></td>
					</tr>
					<tr>
						<th>Versuche</th>
						<td><jsp:getProperty name="tableBean" property="triesSelf" /></td>
						<td><jsp:getProperty name="tableBean" property="triesOponent" /></td>
					</tr>
					<tr>
						<th>Zeit</th>
						<td>0:34</td>
						<td>0:50</td>
					</tr>
					</tbody>
				</table>
				<h3>Spielinformationen</h3>
  				<table id="remaining"
				       title="Anzahl der restlichen Paare"
				       summary="Anzahl der restlichen Paare">
					<tbody>
					<tr>
						<th>Restliche Paare</th>
						<td><jsp:getProperty name="tableBean" property="remainingPairs" /></td>
					</tr>
					</tbody>
				</table>

				<h3>Highscore</h3>
				<ul>
					<li><a href="?petra">Petra: 165 Punkte</a></li>
					<li><a href="?manuel">Manuel: 128 Punkte</a></li>
					<li><a href="?lena">Lena: 115 Punkte</a></li>
					<li><a href="?andi">Andi: 99 Punkte</a></li>
				</ul>
			</div>
			<div id="cards">
				<h2 class="hidden">Spielfeld</h2>
<ul>

<% for (String card : tableBean.getCardsAsXHTML()) { %>
<li> <%= card %> </li>
<% }%>

</ul>
			</div>
			<hr class="solid_clear" />
		</div>
		<div id="footer">© 2011 EWA Memory.</div>
		</div>
	</div>

</body>
</html>
