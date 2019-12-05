package com.example.checks

import com.android.tools.lint.client.api.IssueRegistry
import com.android.tools.lint.detector.api.Issue
import com.sun.istack.NotNull

class CustomLintRegistry : IssueRegistry() {

    @get:NotNull
    override val issues: List<Issue> get() = listOf(TextAppearanceIssue.ISSUE)

}