package dev.brahmkshatriya.echo.common.models

sealed class MediaItemsContainer {
    data class Category(
        val title: String, val list: List<EchoMediaItem>, val subtitle: String? = null
    ) : MediaItemsContainer()

    data class TrackItem(val track: Track) : MediaItemsContainer()
    data class AlbumItem(val album: Album.WithCover) : MediaItemsContainer()
    data class ArtistItem(val artist: Artist.WithCover) : MediaItemsContainer()
    data class PlaylistItem(val playlist: Playlist.WithCover) : MediaItemsContainer()
}