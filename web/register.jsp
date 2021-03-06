<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="de" lang="de">
<head>
<meta http-equiv="Content-Type" content="application/xhtml+xml; charset=utf-8" />
<meta name="description" content="Registrierung zum EWA Memory." />
<meta name="author" content="Christian Zwettler, David Mihola, Florian Mihola" />
<meta name="keywords" content="EWA, Entwicklung von Webanwendungen, Memory, Registrierung, Spiel" />
<title>EWA Memory Registrierung</title>
<link href="styles/reset.css" rel="stylesheet" type="text/css" media="screen" />
<link href="styles/screen.css" rel="stylesheet" type="text/css" media="screen" />
<!--[if gte IE 5.5]>
<link href="styles/ie-screen.css" rel="stylesheet" type="text/css" media="screen" />
<![endif]-->
</head>

<body>
<div id="wrapper">
	<div id="header">
	<img id="header_left" src="img/header_left.png"
		alt="EWA Memory Header Logo" />
	<img id="header_right" src="img/header_right.png"
		alt="EWA Memory Header Logo" />
	</div>
    <div id="navigation">
    	<ul title="Navigation">
    		<li><a href="?lounge">Zurück zur Lounge</a></li>
    		<li><a href="?login">Einloggen</a></li>
    	</ul>
    	<hr class="solid_clear"/>
    </div>
  <div id="main">
  <h1 class="hidden">EWA Memory Registrierung</h1>
    <div id="content">
            <h2>Registrieren</h2>
            <p>Bitte füllen Sie das untenstehende Formular aus!</p>
            <form id="register" method="post" action="">
              <fieldset>
              <legend>Persönliche Daten</legend>
              <div class="feld"><label for="vorname">Vorname</label><input type="text" name="vorname" id="vorname" tabindex="1" /></div>
              <div class="feld"><label for="nachname">Nachname</label><input type="text" name="nachname" id="nachname" tabindex="2" /></div>
              <div class="feld"><label for="geburtsdatum">Geburtsdatum</label><input type="text" name="geburtsdatum" id="geburtsdatum" tabindex="3" /></div>
              <div class="feld"><label for="geschlecht">Geschlecht</label><select name="geschlecht" id="geschlecht" tabindex="4">
                    <option value="w" selected="selected">weiblich</option>
                    <option value="m">männlich</option>
                  </select>
                  </div>
              </fieldset>
              <fieldset>
              <legend>Login Daten und Größe des Stack</legend>
              <div class="feld"><label for="username">Username</label><input type="text" name="username" id="username" tabindex="5" /></div>
              <div class="feld"><label for="passwort">Passwort</label><input type="text" name="passwort" id="passwort" tabindex="6" /></div>
              <div class="feld"><label for="stackgroesse">Größe des Stack</label><input type="text" name="stackgroesse" id="stackgroesse" tabindex="7" /></div>
              </fieldset>
              <div class="buttonwrapper"><input type="submit" name="registrieren" id="registrieren" value="Registrieren" tabindex="8" /></div>
            </form>
    </div>
       <hr class="solid_clear" />
    </div>
    <div id="footer">© 2011 EWA Memory.</div>
</div>
</body>
</html>
