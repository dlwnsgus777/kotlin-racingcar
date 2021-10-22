package racingCar.view

class InputView {
    fun inputData() = Pair(inputCarNames(), inputNumberOfTrial())

    private fun inputCarNames(): List<String> {
        var flag = true
        var result = emptyList<String>()
        while (flag) {
            println(ANSWER_CAR)
            val inputValue = readLine()!!.toString()
            result = inputValue.split(",")

            if (CheckInputValue().isCarNameValid(result)) {
                flag = false
            }
        }

        return result
    }

    private fun inputNumberOfTrial(): Int {
        println(ANSWER_TRY)
        return readLine()!!.toInt()
    }

    companion object {
        private const val ANSWER_CAR = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)."
        private const val ANSWER_TRY = "시도할 횟수는 몇 회인가요?"
    }
}