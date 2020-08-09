import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import styled.css
import styled.styledDiv

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        styledDiv {
            css {
                +AppStyles.main
            }
            +"Welcome to React + Kotlin/JS Web!"
        }
    }
}

fun RBuilder.app() = child(App::class) {}
