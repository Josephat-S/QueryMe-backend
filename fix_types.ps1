$files = Get-ChildItem -Path "src\main\java\com\year2\queryme" -Recurse -Filter "*.java"
foreach ($f in $files) {
    $c = [System.IO.File]::ReadAllText($f.FullName)
    $nc = $c -replace '\bUUID\s+examId\b', 'String examId'
    $nc = $nc -replace '\bUUID\s+studentId\b', 'Long studentId'
    
    # Also fix where these IDs are defined in DTOs, e.g. private UUID examId;
    $nc = $nc -replace 'private\s+UUID\s+examId', 'private String examId'
    $nc = $nc -replace 'private\s+UUID\s+studentId', 'private Long studentId'
    
    if ($c -ne $nc) {
        [System.IO.File]::WriteAllText($f.FullName, $nc)
    }
}
