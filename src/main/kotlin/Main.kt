

    fun main(    ) {

        var array: ArrayList<Int> = ArrayList()


        var notade100 = 0
        var notade50 = 0
        var notade20 = 0
        var notade10 = 0
        var notade5 = 0
        var notade2 = 0
        var notade1 = 0


        var r = readLine()!!.toInt()
        var aux = 0
        var x = r

        while (true) {

            if (x / 100 > 0) {
                aux = x / 100
                x -= aux * 100
                notade100 = aux
                array.add(aux)
            } else if (x / 50 > 0) {
                aux = x / 50
                x -= aux * 50
                notade50 =aux
                array.add(aux)
            } else if (x / 20 > 0) {

                aux = x / 20
                x -= aux * 20
                notade20 = aux
                array.add(aux)
            } else if (x / 10 > 0) {
                aux = x / 10
                x -= aux * 10
               notade10 = aux
                array.add(aux)
            } else if (x / 5 > 0) {
                aux = x / 5
                x -= aux * 5
               notade5 = aux
                array.add(aux)
            } else if (x/2>0) {
                aux = x / 2
                x -= aux * 2
               notade2 = aux
                array.add(aux)
            }else if (x==1) {
                aux = x
                x -= aux
                notade1 = 1
                array.add(aux)
            }else{
                break
            }
        }

        println("$r")
        println("${notade100} nota(s) de R$ 100,00")
        println("${notade50} nota(s) de R$ 50,00")
        println("${notade20} nota(s) de R$ 20,00")
        println("${notade10} nota(s) de R$ 10,00")
        println("${notade5} nota(s) de R$ 5,00")
        println("${notade2} nota(s) de R$ 2,00")
        println("${notade1} nota(s) de R$ 1,00")



    }





