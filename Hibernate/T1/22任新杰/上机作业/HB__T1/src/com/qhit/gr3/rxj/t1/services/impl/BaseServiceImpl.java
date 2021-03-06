package com.qhit.gr3.rxj.t1.services.impl;

import java.util.List;

import com.qhit.gr3.rxj.t1.dao.BaseDao;
import com.qhit.gr3.rxj.t1.dao.impl.BaseDaoImpl;
import com.qhit.gr3.rxj.t1.services.BaseService;

	public class BaseServiceImpl implements BaseService {
		private BaseDao baseDao = new BaseDaoImpl();
		
		/* (non-Javadoc)
		 * @see com.qhit.lh.grs.wjk.t1.service.BaseService#add(java.lang.Object)
		 */
		@Override
		public void add(Object obj) {
			// TODO Auto-generated method stub
			baseDao.add(obj);
		}

		/* (non-Javadoc)
		 * @see com.qhit.lh.grs.wjk.t1.service.BaseService#delete(java.lang.Object)
		 */
		@Override
		public void delete(Object obj) {
			// TODO Auto-generated method stub
			baseDao.delete(obj);
		}

		/* (non-Javadoc)
		 * @see com.qhit.lh.grs.wjk.t1.service.BaseService#update(java.lang.Object)
		 */
		@Override
		public void update(Object obj) {
			// TODO Auto-generated method stub
			baseDao.update(obj);
		}

		/* (non-Javadoc)
		 * @see com.qhit.lh.grs.wjk.t1.service.BaseService#getAll(java.lang.String)
		 */
		@Override
		public List<Object> getAll(String fromObject) {
			// TODO Auto-generated method stub
			return baseDao.getAll(fromObject);
		}

	}
