package engineer.ohaz.views

import engineer.ohaz.AutumnModel
import org.controlsfx.control.Notifications
import tornadofx.*

class AutumnForm : View("Autumn"){
    val model: AutumnModel by inject()

    override val root = form {
        fieldset {
            field("Name") {
                textfield(model.name).required()
            }
        }
        button("Save") {
            action {
                model.commit {
                    val autumn = model.item
                    Notifications.create()
                            .title("Test")
                            .text("Hello World! ${autumn.name}")
                            .owner(this)
                            .showInformation()
                }
            }
            enableWhen (model.valid)
        }
    }
}