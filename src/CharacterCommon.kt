object CharacterCommon {
    fun attack(character: Character) {
        with(character) {
            when (character) {
                is Character.Archer -> {
                    println("$name ${character.ability} приминил способность ${weaponType.weapon}")
                }

                is Character.Mage -> {
                    println("$name ${character.spell} применил заклинание ${weaponType.weapon}")
                }

                is Character.Warrior -> {
                    println("$name ${character.ability} применил способность ${weaponType.weapon}")
                }
            }
        }
    }

    fun defend(character: Character) {
        with(character) {
            when (character) {
                is Character.Archer -> {
                    println("$name ${character.ability} применив уклонение")
                }

                is Character.Mage -> {
                    println("$name ${character.spell} применил заклинание Защита тьмы")
                }

                is Character.Warrior -> {
                    println("$name ${character.ability} применил способность Защита архАнгела")
                }
            }
        }
    }
}