package examples


import java.awt.Color
import org.uqbar.arena.widgets.*
import org.uqbar.arena.windows.MainWindow
import org.uqbar.arena.kotlin.extensions.*
import org.uqbar.commons.model.annotations.Observable

fun main() = ExampleWindow(AppModel(42, Color.darkGray)).startApplication()

@Observable class AppModel(var number: Int, var bg: Color)

class ExampleWindow(model: AppModel) : MainWindow<AppModel>(model) {
    override fun createContents(mainPanel: Panel) {
        title = "Example"
        Label(mainPanel) with {
            text = "Soy un label"
            bindBackgroundTo("bg")
        }
        TextBox(mainPanel) with {
            bindTo("number")
        }
    }
}