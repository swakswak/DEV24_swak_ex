package com.dev24.admin.book.dao;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dev24.client.book.dao.BookDAO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class AdminBookMapperTest {
	
	@Setter(onMethod_ = @Autowired)
	private BookDAO bookDAO;
	
	@Setter(onMethod_ = @Autowired)
	private AdminBookDAO adminBookDAO;
	
//	@Test
//	public void testBookList() {
//		BookVO bvo;
//		int bookLength = bookDAO.getBookListCnt(bvo);
//		Pagination pagination = new Pagination(bookLength, startPage, page, cateOne_num, cateTwo_num, listRange, b_sort, b_stateKeyword);
//		ArrayList<BookVO> bList = bookDAO.bookList();
//		log.info("bvo 占쏙옙占쏙옙占쏙옙占쏙옙");
//		
//		//占쏙옙占� 占쏙옙占쏙옙占쏙옙
//		for (int i = 0 ; i < bList.size() ; i++) {
//			bvo = bList.get(i);
//			log.info(bvo.toString());
//					
//		}
//		
//		//index 0, 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占싶몌옙
//		String first = bList.get(0).toString();
//		String last = bList.get(bookList.size() - 1).toString();
//		
//		log.info(first);
//		log.info(last);
//		
//	}
	
//	@Test public void testUpdateBookState() {
//		log.info("testUpdateBookState 占쌓쏙옙트 占쏙옙占쏙옙");
//		
//		BookVO bvo;
//
//		bvo = new BookVO();
//
//		List<Integer> bNumList = new ArrayList<Integer>();
//		bNumList.add(3);
//		bNumList.add(4);
//		bNumList.add(5);
//		bvo.setBNumList(bNumList);
//		
//		//bvo.setB_numArr(new int[] {3, 4, 5});
////		bvo.setB_stateKeyword("reg");
////		bvo.setB_stateKeyword("soldOut");
//		bvo.setB_stateKeyword("outOfPrint");
//		
//		int result = adminBookDAO.updateBookState(bvo);
//		
//		log.info("result: " + result);
//	}
	
}
