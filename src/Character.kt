import kotlin.String
import kotlin.String as String1

sealed class Character(
    val name: String1,
    val weaponType: WeaponType) {
    abstract val ability: String1

    class Warrior(override val ability: String1) : Character(WARRIOR, WeaponType.SWORD)
    class Mage(val spell: String1, override val ability: String) : Character (MAGE, WeaponType.STICK)
    class Archer(override val ability: String1) : Character (ARCHER, WeaponType.BOW)

    companion object{
        const val WARRIOR = "Рендельф"
        const val MAGE = "Микаэль"
        const val ARCHER = "Гога"
    }
}