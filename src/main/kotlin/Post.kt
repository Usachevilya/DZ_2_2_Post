import java.util.*

data class Post (
        var id: Int,
        val ownerId: Int,
        val fromId: Int,
        val createdBy: Int,
        val date: Int,
        val text: String,
        val replyOwnerId: Int,
        val replyPostId: Int,
        val friendsOnly: Int,
        val comments: Comments,
        var copyright: String,
        var likes: Likes,
        var reposts: Reposts,
        var views: Views,
        var postType: String,
        val signerId: Int,
        var canPin: Boolean,
        var canDelete: Boolean,
        var canEdit: Boolean,
        var isPinned: Int,
        var markedAsAds: Boolean,
        var isFavorite: Boolean,
        var postponedId: Int
        )
var idUnification = 0
object WallService {
        var posts = emptyArray<Post>()

        fun add(post: Post): Post {
                idUnification += 1
                posts += post
                post.id = idUnification
                return posts.last() // Так мы просто создаем и выводим последний элемент массива) Это понятно)
                // как id присвоить именно универсальный? по факту нужно сравнить post.id  с предыдущим post.id и прибавить
                // еденицу например. Не могу сообразить как это сделать(
        }
        fun update(post: Post): Boolean {
                for (post in posts) {
                        if(post.id.equals(posts[post.id])) {
                                posts += post
                                return true
                        }
                }
                return false
        }
}