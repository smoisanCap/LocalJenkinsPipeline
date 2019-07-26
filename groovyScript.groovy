#!/usr/bin/env groovy

import hudson.model.*
import hudson.AbortException
import hudson.console.HyperlinkNote
import java.util.concurrent.CancellationException
import jenkins.model.*
 
// Retrieve parameters of the current build
println "Get and print jenkins parameters"
 
// get current thread / Executor
def thr = Thread.currentThread()
// get current build
def build = thr?.executable

def listOfName = build.buildVariableResolver.resolve("listOfName")
println "listOfName=$listOfName"