package app.servingwebcontent;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface BuddyInfoRepository extends PagingAndSortingRepository<BuddyInfo, Long> {

    List<BuddyInfo> findByName(String Name);

    BuddyInfo findById(long id);

    List<BuddyInfo> findAll();
}