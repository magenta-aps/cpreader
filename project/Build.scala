/* ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 2.0/GPL 2.0/LGPL 2.1
 *
 * The contents of this file are subject to the Mozilla Public License
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS"basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * Contributor(s):
 * Søren Kirkegård
 *
 * The code is currently governed by OS2 - Offentligt digitaliserings-
 * fællesskab / http://www.os2web.dk .
 *
 * Alternatively, the contents of this file may be used under the terms of
 * either the GNU General Public License Version 2 or later (the "GPL"), or
 * the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 * in which case the provisions of the GPL or the LGPL are applicable instead
 * of those above. If you wish to allow use of your version of this file only
 * under the terms of either the GPL or the LGPL, and not to allow others to
 * use your version of this file under the terms of the MPL, indicate your
 * decision by deleting the provisions above and replace them with the notice
 * and other provisions required by the GPL or the LGPL. If you do not delete
 * the provisions above, a recipient may use your version of this file under
 * the terms of any one of the MPL, the GPL or the LGPL.
 *
 * ***** END LICENSE BLOCK ***** */

import sbt._
import Keys._
import play.Project._
import java.io.File

object ApplicationBuild extends Build {

  val appName         = "play-cpreader"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    javaCore,
    javaEbean,
    
    // custom dependencies
    "joda-time" % "joda-time" % "2.3",						// better datetime
    "com.unboundid" % "unboundid-ldapsdk" % "2.3.4",		// ldap
    "com.google.inject" % "guice" % "3.0",					// dependency injection
    "org.perf4j" % "perf4j" % "0.9.16",						// performance logging
    
    // webjars - used in development
//    "org.webjars" %% "webjars-play" % "2.2.0",				// dependency for using webjars with play
//    "org.webjars" % "jquery" % "1.9.0",						// jquery
//    "org.webjars" % "bootstrap" % "3.0.1",					// bootstrap						
//    "org.webjars" % "bootstrap-glyphicons" % "bdd2cbfba0",	// glyphicons
    
    // testing frameworks
    "org.mockito" % "mockito-all" % "1.9.5"	% "test"		// mocking for testing
    //"org.pitest" % "pitest" % "0.31" % "test",			// mutation testing - future use
    
    
    
  )
  

  val main = play.Project(appName, appVersion, appDependencies).settings(
    requireJs += "main.js",
    requireJsShim += "main.js"
  )

}