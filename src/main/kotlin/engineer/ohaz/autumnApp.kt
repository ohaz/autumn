package engineer.ohaz


import javafx.application.Application
import tornadofx.App


class AutumnApp : App(AutumnForm::class, AutumnStyles::class)

fun main(args: Array<String>){
    Application.launch(AutumnApp::class.java, *args)
}