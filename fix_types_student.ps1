$files = Get-ChildItem -Path "src\main\java\com\year2\queryme" -Recurse -Filter "*.java"
foreach ($f in $files) {
    $c = [System.IO.File]::ReadAllText($f.FullName)
    $nc = $c -replace '\bLong\s+studentId\b', 'String studentId'
    $nc = $nc -replace 'private\s+Long\s+studentId', 'private String studentId'
    if ($c -ne $nc) {
        [System.IO.File]::WriteAllText($f.FullName, $nc)
    }
}
