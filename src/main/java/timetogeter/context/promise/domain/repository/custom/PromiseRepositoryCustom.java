package timetogeter.context.promise.domain.repository.custom;

import timetogeter.context.promise.domain.entity.Promise;

public interface PromiseRepositoryCustom {
    void deletePromiseWithRelatedData(String promiseId);


}
