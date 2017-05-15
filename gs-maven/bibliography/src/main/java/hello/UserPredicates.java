package hello;

import hello.QUser;

import com.querydsl.core.types.Predicate;
 
final class UserPredicates {
 
 
    public static Predicate hasTitle(String title) {
        return QUser.user.title.eq(title);
    }
    
    public static Predicate ContainsIgnoreCase(String searchTerm) {
        if (searchTerm == null || searchTerm.isEmpty()) {
            return QUser.user.isNotNull();
        }
        else {
            return (QUser.user.journal.likeIgnoreCase("%"+searchTerm+"%")
                    .or(QUser.user.title.likeIgnoreCase("%"+searchTerm+"%"))
                    .or(QUser.user.year.like("%"+searchTerm+"%")
                    .or(QUser.user.author.likeIgnoreCase("%"+searchTerm+"%"))));
        }
    }
}