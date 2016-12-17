package intellidots

class Solution {

    String language
    String code
    Date uploadDate
    User author

    static constraints = {
        language blank: false, nullable: false
        code blank: false, nullable: false
        uploadDate blank: false, nullable: false
        author blank: false, nullable: false
    }
}
