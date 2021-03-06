
enablePlugins(WorkbenchPlugin)

//bootSnippet := "example.T1().main(document.getElementById('mydiv'));"
// workbenchDefaultRootObject := Some(("resources/leaflet2-dev.html", "build/"))  // (defaultRootObject, rootDirectory) 

publishArtifact:= false

libraryDependencies ++= Seq( 
       "org.scala-lang.modules"    %%  "scala-xml"                    % "1.0.6",
    "com.thoughtworks.binding"  %%% "dom"                         % "11.3.0",
    "com.thoughtworks.binding"  %%% "futurebinding"               % "11.3.0",
    "com.thoughtworks.binding"  %%% "route"                       % "11.3.0",
    compilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full),
)
