resolvers += Resolver.url("artifactory", url("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases"))(Resolver.ivyStylePatterns)

resolvers += Resolver.url("sbt-plugin-releases-scalasbt", url("http://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns)

resolvers += "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"

resolvers += Classpaths.sbtPluginReleases

// addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.10")

// addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "5.2.4")

// addSbtPlugin("com.lightbend.sbt" % "sbt-proguard" % "0.3.0")

// addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.6.1")

// addSbtPlugin("de.heikoseeberger" % "sbt-header" % "5.4.0") 

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.11.2")

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "5.0.1")

addSbtPlugin("com.typesafe.sbt" % "sbt-proguard" % "0.2.2")

addSbtPlugin("org.scoverage" %% "sbt-scoverage" % "0.99.7.1")

addSbtPlugin("de.heikoseeberger" % "sbt-header" % "1.5.0")
