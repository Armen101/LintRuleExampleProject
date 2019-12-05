package com.example.checks

import com.android.tools.lint.detector.api.ResourceXmlDetector
import com.android.tools.lint.detector.api.XmlContext
import org.w3c.dom.Element

class TextViewStyleDetector : ResourceXmlDetector() {

    override fun getApplicableElements() = listOf(TEXT_VIEW)

    override fun visitElement(context: XmlContext, element: Element) {
        if (!element.hasAttributeNS(SCHEMA, TEXT_APPEARANCE)) {
            context.report(
                TextAppearanceIssue.ISSUE,
                context.getLocation(element),
                TextAppearanceIssue.EXPLANATION
            )
        }
    }

    companion object {
        private const val SCHEMA = "http://schemas.android.com/apk/res/android"
        private const val TEXT_APPEARANCE = "textAppearance"
        private const val TEXT_VIEW = "TextView"
    }
}