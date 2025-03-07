// базовый класс
open class Экзамен(var имя: String,
                   var предмет: String,
                   var датаЭкзамена: String,
                   var отметка: Int
){
    open fun info(){
        println("\nИмя студента : $имя")
        println("Предмет : $предмет \nДата экзамена : $датаЭкзамена")
        println("Отметка : $отметка")
    }
    open fun Результат(){
        when{
            отметка < 3 -> println("На пересдачу!")
            отметка == 3 -> println("Результат : Удовлетворительно.")
            отметка == 4 -> println("Результат : Хорошо")
            отметка == 5 -> println("Результат : Отлично!")
        }
    }
}
class Пересдача(
    имя: String,
    предмет: String,
    датаЭкзамена: String,
    отметка: Int,
    var попытка: Int // доп. св-во
): Экзамен(имя, предмет, датаЭкзамена, отметка){
    open fun Попытки(){
        when{
            попытка == 2 -> println("Последняя пересдача")
        }
    }
    open fun Ответ(){
        when{
            отметка >= 3 -> println("Сдал!")
        }
    }
}

    fun main(){
    var студент1 = Экзамен("Антон", "Экономика", "14.04.25", 4)
        студент1.info()

    var студент2 = Пересдача("Светлана", "Экономика", "17.04.25", 4, 2)
        студент2.info()
        студент2.Попытки()

    var студент3 = Экзамен("Елизавета", "Экономика", "14.04.25", 5)
        студент3.info()
        студент3.Результат()

    var студент4 = Пересдача("Ярослав", "Экономика", "14.04.25", 3, 1)
        студент4.info()
        студент4.Ответ()
}