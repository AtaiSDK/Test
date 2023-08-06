package com.example.test

class Math {

    fun add(a : String, b : String): String{

        val regex = Regex("\\s+")
        if (regex.containsMatchIn(a) || regex.containsMatchIn(b)) {
            return "Вы ввели лишние пробелы"
        }

        if (a.isEmpty() or b.isEmpty()){
            return "Вы ввели пустое поле"
        }

        if(a.contains("..") or b.contains("..")){
            return "Вы ввели две точки"
        }
    var result = ""
        try {
        if(a.contains(".") or b.contains(".")){
            result = (a.toDouble() + b.toDouble()).toString()
            if(result.toDouble() % 1 > 0.0){
                return result
            }else{
                result = result.replace(".0", "")
                return result
            }
        }else{
            result = (a.toInt() + b.toInt()).toString()
        }
        }catch (ex: Exception){
            return "Некорректный ввод"
        }

        return result
    }

    fun divide(a: String, b: String): String{
        var result = ""
        if(b.toInt()==0){
            result = "на 0 нельзя"
        }else{
            result = (a.toInt() / b.toInt()).toString()
        }
        return result
    }
}