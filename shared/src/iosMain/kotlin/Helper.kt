import org.koin.core.context.startKoin

fun initKoin() {
    startKoin {
        modules(di.appModule())
    }
}
