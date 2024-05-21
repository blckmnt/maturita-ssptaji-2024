# Směrování v sítích
Směrování určuje jak se dostananou data z jedné sítě do druhé
Probíhá na 3. Síťové vrstvě ISO/OSI
### Prvky
- Router
- L3 Switch
- Firewall
- ...

Směrují se **packety**

### Směrovací tabulka
- Textový soubor
- Každý řádek jeden záznam
- Má ji každý PC
- Řídí na jaké rozhraní se odešle packet podle cílové adresy

## Směrovací / Směrované protokoly
### Směrované (Routed)
To jsou ty protokoly, které jsou směrované (**trpný rod**), těmi SMĚROVACÍMI
- IP
- ...

### Směrovací (Routing)
Protokoly, které routují ty routované protokoly :D
- RIP, RIP2
- OSPF
- ...

## Statické / Dynamické
### Statické
Ručně zadané cesty. Nepřisbůsobí se náhodným podmínkám, když třeba vypadne bod na trase

### Dynamické
Pomocí **routovacího protokolu**. Automaticky přispusobující se tabulka podle podmínek.

### Default
Pokud neexistuje jiná cesta

## Způsoby 