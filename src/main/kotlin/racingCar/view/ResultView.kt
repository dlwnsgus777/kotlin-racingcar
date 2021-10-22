package racingCar.view

import racingCar.model.Cars

class ResultView {
    fun show(cars: Cars, trialNumber: Int) {
        println(RESULT)
        println("$trialNumber $TRIAL")
        result(cars)
    }

    private fun result(cars: Cars) {
        cars.result().forEach {
            val (name, mileage) = it
            println("$name : ${EMOTICON_CAR.repeat(mileage)}")
        }
    }

    fun victoryPlayer(cars: Cars) {
        println("우승자는 ${cars.victoryPlayer().joinToString()} 입니다!!")
    }

    companion object {
        private const val RESULT = "실행 결과"
        private const val TRIAL = "회차"
        private const val EMOTICON_CAR = "\uD83D\uDE99"
    }
}