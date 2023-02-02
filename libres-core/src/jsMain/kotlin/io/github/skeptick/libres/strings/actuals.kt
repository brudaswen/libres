package io.github.skeptick.libres.strings

import kotlinx.browser.window

actual fun getPlatformLanguageCode(): String {
    return if (window.navigator.languages.isNotEmpty()) {
        window.navigator.languages[0].languageCode
    } else {
        window.navigator.language.languageCode
    }
}

actual fun getPluralizedString(forms: PluralForms, languageCode: String, number: Int): String {
    val form = getPluralForm(languageCode, number)
    return forms[form] ?: error("Plural form '$form' not provided")
}

private inline val String.languageCode get() = if (length == 2) this else take(2)