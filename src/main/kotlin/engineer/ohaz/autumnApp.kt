package engineer.ohaz


import javafx.application.Application
import tornadofx.App

import engineer.ohaz.views.AutumnView


class AutumnApp : App(AutumnView::class, AutumnStyles::class)

fun main(args: Array<String>){
    Application.launch(AutumnApp::class.java, *args)
}