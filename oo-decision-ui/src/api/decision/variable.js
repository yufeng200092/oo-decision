import request from '@/utils/request'

// 查询决策变量列表
export function listVariable(query) {
  return request({
    url: '/decision/variable/list',
    method: 'get',
    params: query
  })
}

// 查询决策变量详细
export function getVariable(vbId) {
  return request({
    url: '/decision/variable/' + vbId,
    method: 'get'
  })
}

// 新增决策变量
export function addVariable(data) {
  return request({
    url: '/decision/variable',
    method: 'post',
    data: data
  })
}

// 修改决策变量
export function updateVariable(data) {
  return request({
    url: '/decision/variable',
    method: 'put',
    data: data
  })
}

// 删除决策变量
export function delVariable(vbId) {
  return request({
    url: '/decision/variable/' + vbId,
    method: 'delete'
  })
}

// 导出决策变量
export function exportVariable(query) {
  return request({
    url: '/decision/variable/export',
    method: 'get',
    params: query
  })
}
