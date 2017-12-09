package engineer.ohaz

import javafx.beans.property.StringProperty
import tornadofx.*

class Autumn {
    var name by property<String>()
    fun nameProperty() = getProperty(Autumn::name)

    override fun toString() = name
}

class AutumnModel:ItemViewModel<Autumn>(Autumn()) {
    val name: StringProperty = bind {item?.nameProperty()}
}