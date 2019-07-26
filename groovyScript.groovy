#!/usr/bin/env groovy

import hudson.model.*
import hudson.AbortException
import hudson.console.HyperlinkNote
import java.util.concurrent.CancellationException
 
// Retrieve parameters of the current build
def listOfName = build.buildVariableResolver.resolve("listOfName")
println "listOfName=$listOfName"