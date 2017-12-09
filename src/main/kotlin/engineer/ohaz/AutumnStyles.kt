package engineer.ohaz

import tornadofx.Stylesheet
import tornadofx.box
import tornadofx.cssclass
import tornadofx.px

class AutumnStyles : Stylesheet() {

    init {
        s(form) {
            padding = box(25.px)
            prefWidth = 450.px
        }
    }
}