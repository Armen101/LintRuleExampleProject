package com.example.checks

import com.android.tools.lint.detector.api.Category
import com.android.tools.lint.detector.api.Category.Companion.TYPOGRAPHY
import com.android.tools.lint.detector.api.Implementation
import com.android.tools.lint.detector.api.Issue
import com.android.tools.lint.detector.api.Scope.Companion.RESOURCE_FILE_SCOPE
import com.android.tools.lint.detector.api.Severity

internal object TextAppearanceIssue {

    private const val ID = "MissingTextAppearance"
    private const val DESCRIPTION = "textAppearance attribute is missing"
    const val EXPLANATION =
        "We should use textAppearance to style a TextView in order to provide consistent design"
    private val CATEGORY: Category = TYPOGRAPHY
    private const val PRIORITY = 4
    private val SEVERITY = Severity.WARNING

    val ISSUE = Issue.create(
        ID,
        DESCRIPTION,
        EXPLANATION,
        CATEGORY,
        PRIORITY,
        SEVERITY,
        Implementation(TextViewStyleDetector::class.java, RESOURCE_FILE_SCOPE)
    )
}