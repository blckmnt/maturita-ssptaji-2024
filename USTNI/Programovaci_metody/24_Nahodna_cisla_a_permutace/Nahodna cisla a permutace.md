# Náhodná čísla v programování
Opravdu náhodné číslo je deterministickém stroji, jako je počítač, těžké vytvořit - to jsou potom tzv. **pseudonáhodná čísla**...

#### Determininismus v IT

Deterministický algoritmus je v informatice označení pro algoritmus, který vždy ze stejných výchozích (vstupních) podmínek svým během vytvoří stejné výsledky (je tedy předvídatelný). *[Wikipedie](https://cs.wikipedia.org/wiki/Deterministick%C3%BD_algoritmus)*

### Java
Třída `java.util.Random`
- používá **seed**, defaultně systémový čas, tím docílíme určitou "náhodnost" čísel
    - můžeme ho i zadat ručně: `Random rand = new Random(seed);` pokud zadáme bude nám v každém běhu generovat po sobě úplně ty samá čísla

## Skutečně náhodná čísla
- pomocí různých přírodních úkazů
    - různé šumy
        - šum z vesmíru
    - Cloudfare třeba používá lávové lampy
    - náhodný rozpad radioaktivního izotopu

Pro opravdu náhodná čísla si můžeme koupit i kartu do PC, která využívá právě těch přírodních jevů

# Permutace
- **speciální případ variace**
- počítá se přes faktoriál
    - 5! = 5 . 4 . 3 . 2 . 1

### Výpočtem získáme všechny možné uspořádaní prvků
### A B C - Perm. bez opakování
- ABC, BAC, CAB ...

## Brute force
- prostě jede sekvenčně
- při vyšších desítkách nepočitatelné
- třeba v běžných kalkulačkách pro SŠ je max 69! xd