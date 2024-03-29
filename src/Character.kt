sealed class Character(
    val name: Guzi,
    val weaponType: WeaponType) {
    abstract val ability: Guzi

    class Warrior(override val ability: Guzi) : Character(WARRIOR, WeaponType.SWORD)
    class Mage(val spell: Guzi) : Character (MAGE, WeaponType.STICK)
    class Archer(override val ability: Guzi) : Character (ARCHER, WeaponType.BOW)

    companion object{


        const val WARRIOR = "Рендельф"
        const val MAGE = "Микаэль"
        const val ARCHER = "Гога"
    }
}