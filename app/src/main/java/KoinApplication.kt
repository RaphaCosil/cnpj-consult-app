import com.example.login.NavigationLoginImpl
import com.example.navigation.NavigationLogin
import com.example.navigation.NavigationSignUp
import com.example.signup.NavigationSignUpImpl
import org.koin.dsl.module

val navigationModule = module {
    factory<NavigationLogin> {
        NavigationLoginImpl()
    }
    factory<NavigationSignUp> {
        NavigationSignUpImpl()
    }
}
