# Soubory v programování
### **pozn. kryje se z otázkou 1. Kódování dat**

### Soubor
Množina dat, uložená na dat. mediu. Posloupnost bitů

### Data, Metadata
viz [Kodóvání dat](/Ustni/1_Kodovani_dat/Kodovani%20dat.md)

### Soubory můžeme
- otevírat/zavírat
- tvořit/mazat
- číst/zapisovat

### Přístup z datům
- sekvenční (znak po znaku, řádek po řádku)
- náhodný

## Druhy souborů
- ### Binární
    Posloupnost bajtů
- ### Textové
    Posloupnost znaků
    - zakončení řádku - EOL (znak)
    - zakončení souboru - EOF (znak)

- ### CSV
    - jednotlivé hodnoty jsou odděleny čárkou, středníkem, pomlčkou, tabulátorem, lomítkem ...

        ```/moje/nejoblibenejsi/jidlo/je/pizza/```

- ### Strukturované
    - XML, JSON, YAML

        ###### *JSON soubor*
        ```json
        {
            "glossary": {
                "title": "example glossary",
                "GlossDiv": {
                    "title": "S",
                    "GlossList": {
                        "GlossEntry": {
                            "ID": "SGML",
                            "SortAs": "SGML",
                            "GlossTerm": "Standard Generalized Markup Language",
                            "Acronym": "SGML",
                            "Abbrev": "ISO 8879:1986",
                            "GlossDef": {
                                "para": "A meta-markup language, used to create markup languages such as DocBook.",
                                "GlossSeeAlso": ["GML", "XML"]
                            },
                            "GlossSee": "markup"
                        }
                    }
                }
            }
        }
        ```

## Čtení / Zápis

### Třídy
- File
    - FileWriter
        - BufferedWriter
    - FileReader
        - BufferedReader

### Třída File
[Metody](https://docs.oracle.com/javase/8/docs/api/java/io/File.html#method.summary)
#### Nějaké příklady
- createNewFile()
- delete()
- getName,Path,FreeSpace,TotalSpace...

### Čtení
- FileReader - čte znak po znaku
- BufferedReader - čte celé řádky

### Zápis
- FileWriter - "hloupější", ale postačí
- BufferedWriter - nějaké přidané metody, kdybychom potřebovali ( newLine() )
