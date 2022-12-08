package lz.service;

import lz.entity.UserBorrowDetail;

public interface BorrowService {

    UserBorrowDetail getUserBorrowDetailByUid(int uid);
}
