// базовый класс
open class Samolet(var marka: String,
                   var punktOtprav: String,
                   var punktPrib: String,
                   var data: String,
                   var timeOtpr: String,
                   var timePrib: String
                   ){

            open fun info(){
                println("\nМодель самолета : $marka")
                println("Дата отправления : $data")
                println("Пункт отправления : $punktOtprav \nВремя : $timeOtpr")
                println("Пункт прибытия : $punktPrib \nВремя : $timePrib")
            }
}
//класс-наследник с дополнительным св-ом
class GrusSamolet(
    marka: String,
    punktOtprav: String,
    punktPrib: String,
    data: String,
    timeOtpr: String,
    timePrib: String,
    var massaGruza: Int // дополнительное св-во
): Samolet(marka, punktOtprav, punktPrib, data, timeOtpr, timePrib){
    open fun gruz(){
        println("Грузоподъемность самолета : $massaGruza кг")
    }
}
// второй класс-наследник с дополнительным св-ом
class PasSamolet(
    marka: String,
    punktOtprav: String,
    punktPrib: String,
    data: String,
    timeOtpr: String,
    timePrib: String,
    var countMest: Int // дополнительное св-во
): Samolet(marka, punktOtprav, punktPrib, data, timeOtpr, timePrib){
    open fun gruz(){
        println("Кол-во мест : $countMest кг")
    }
}

fun main(){
    // объект базового класса
    var plane1 = Samolet("Boing 312", "Moscow", "Ekaterinburg", "08.03.2024", "16.40", "19.20")
    plane1.info()

    var gruzPlane1 = GrusSamolet("Air 365", "London", "Paris", "08.03.2024", "10.40", "14.00",236)
    gruzPlane1.info()

    var pasPlane1 = PasSamolet("Boing 312", "Sochi", "Samara", "09.03.2024", "1.40", "2.20", 240)
    plane1.info()

    var psevPlane1 = Samolet("Boing 312", "Rostov", "Ekaterinburg", "08.03.2024", "22.05", "00.55")
    plane1.info()

    var psevPlane2 = PasSamolet("Boing 1", "Moscow", "Sankt-Peterburg", "09.03.2024", "6.10", "7.30", 140)
    plane1.info()

}