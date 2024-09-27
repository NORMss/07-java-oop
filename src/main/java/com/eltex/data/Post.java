package com.eltex.data;

public record Post(String content, String author, int likes) {

    public Builder builder() {
        return new Builder()
                .setAuthor(author)
                .setContent(content)
                .setLikes(likes);
    }

    static class Builder {
        private String content = "";
        private String author = "";
        private int likes = 0;

        public Builder setContent(final String content) {
            this.content = content;
            return this;
        }

        public Builder setAuthor(final String author) {
            this.author = author;
            return this;
        }

        public Builder setLikes(final int likes) {
            this.likes = likes;
            return this;
        }

        public Post build() {
            return new Post(content, author, likes);
        }
    }
}
