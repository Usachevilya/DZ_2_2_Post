data class Comments(
    var count: Int,
    var canPost: Boolean,
    val groupsCanPost: Int,
    var canClose: Boolean,
    var canOpen: Boolean
)