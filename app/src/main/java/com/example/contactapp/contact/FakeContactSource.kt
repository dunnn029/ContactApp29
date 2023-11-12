package com.example.contactapp.contact

class FakeContactSource {
    fun getContact(): ArrayList<ContactData> {
        val contact = ArrayList<ContactData>()

        contact.add(
            ContactData(
            1,
            "Tiến Dũng",
            "0981291787",
            "dungntna02@gmail.com"
        )
        )

        contact.add(
            ContactData(
            2,
            "Bích Hoan",
            "0911111111",
            "tranthibichhoan@gmail.com"
        )
        )

        contact.add(
            ContactData(
            3,
            "J áck",
            "0987654321",
            "kicm@gmail.com"
        )
        )

        contact.add(
            ContactData(
            4,
            "Đạt Village",
            "0999999999",
            "dat1villa@gmail.com"
        )
        )

        contact.add(
            ContactData(
            5,
            "Xuân Huấn",
            "0234234234",
            "buihuan@gmail.com"
        )
        )

        contact.add(
            ContactData(
            6,
            "Khá Ngô",
            "0345345345",
            "ngobakha@gmail.com"
        )
        )

        contact.add(
            ContactData(
            7,
            "Doãn Đại Hiệp",
            "0456456465",
            "doandaihiep@gmail.com"
        )
        )

        contact.add(
            ContactData(
            8,
            "Dương Quá",
            "0567567567",
            "duongduong@gmail.com"
        )
        )

        contact.add(
            ContactData(
            9,
            "Cây ICM",
            "0112234545",
            "jack@gmail.com"
        )
        )

        contact.add(
            ContactData(
            10,
            "Mạnh Đức",
            "0192837456",
            "taohuynh@gmail.com"
        )
        )

        contact.add(
            ContactData(
            11,
            "Phụng Tiên",
            "0758696868",
            "bopp@gmail.com"
        )
        )

        contact.add(
            ContactData(
            12,
            "Quách Tĩnh",
            "0973648645",
            "tinhkaka@gmail.com"
        )
        )

        return contact
    }
}