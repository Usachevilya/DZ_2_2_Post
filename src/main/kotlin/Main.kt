fun main() {
    var comments1 = Comments(
        count = 2,
        canPost = false,
        groupsCanPost = 21,
        canClose = false,
        canOpen = false
    )
    val likes1 = Likes(
        count = 12,
        userLikes = false,
        canLike = false,
        canPublish = false
    )
    val reposts1 = Reposts(
        count = 12,
        userReposted = false
    )
    val views1 = Views(
        count = 123
    )
    val post = Post(
        id = 1,
        ownerId = 3,
        fromId = 2,
        createdBy = 1,
        date = 12,
        text = "Post",
        replyOwnerId = 3,
        replyPostId = 1,
        friendsOnly = 1,
        comments = comments1,
        copyright = "Copy",
        likes = likes1,
        reposts = reposts1,
        views = views1,
        postType = "Hello",
        signerId = 1,
        canPin = false,
        canDelete = false,
        canEdit = false,
        isPinned = 2,
        markedAsAds = false,
        isFavorite = false,
        postponedId = 23
    )
    WallService.add(post)
}