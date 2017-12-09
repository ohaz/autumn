package engineer.ohaz.views

import tornadofx.*

class AutumnView : View("Autumn"){
    val topBar: TopView by inject()
    val bottomForm: AutumnForm by inject()

    override val root = borderpane {
        top = topBar.root
        bottom = bottomForm.root
    }
}