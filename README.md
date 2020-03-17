# View Binding Linter error

Sample project showing a linter error when using View Binding.

The only difference between commit `de3c5f9` and `d92e4a4` is the use of View Binding.

If you run `./gradlew lint` on the first commit, there are no warning related to unused resources. If you run again on the second commit, the linter tells you the main layout is not used, which is wrong.