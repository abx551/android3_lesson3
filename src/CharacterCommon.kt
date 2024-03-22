object CharacterCommon {
    fun attack(character: Character) {
        with(character) {
            when (this) {
                is Character.Archer -> {
                    println("$name приминил способность ${this.ability}  ${weaponType.weapon}")
                }

                is Character.Mage -> {
                    println("$name  применил заклинание ${this.spell} ${weaponType.weapon}")
                }

                is Character.Warrior -> {
                    println("$name применил способность ${this.ability} ${weaponType.weapon}")
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