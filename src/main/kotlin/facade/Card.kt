package facade

//representa la configuración de una tarjeta. En la clase se
//incluye el prefijo, la compañía (AMEX, Mastercard, VISA) y el tipo de tarjeta
//(crédito, debito)
class Card {
    private var prefix: String? = null
    private var company: String? = null
    private var cardType //{Credit|Debit}
            : String? = null

    constructor(prefix: String?, company: String?, cardType: String?) {
        this.prefix = prefix
        this.company = company
        this.cardType = cardType
    }

    fun getPrefix(): String? {
        return prefix
    }

    fun setPrefix(prefix: String?) {
        this.prefix = prefix
    }

    fun getCompany(): String? {
        return company
    }

    fun setCompany(company: String?) {
        this.company = company
    }

    fun getCardType(): String? {
        return cardType
    }

    fun setCardType(cardType: String?) {
        this.cardType = cardType
    }


}