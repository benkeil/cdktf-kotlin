plugins { id("org.danilopianini.gradle-pre-commit-git-hooks") version "1.0.19" }

rootProject.name = "cdktf-java"

gitHooks {
    commitMsg { conventionalCommits() }
    preCommit { from { "./gradlew ktfmtFormat" } }
    createHooks()
}
